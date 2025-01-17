interface Plugin{
  void do(CB); 
  void do(CC);  
}
interface CA{
  void f1();
  void f2();
  void invoke(Plugin p);
}
class CB extends CA{
  void f1(){} //1B
  void f2(){} //2B
  void invoke(Plugin p){
    p.do(this);
  }
}
class CC extends CA{
  void f1(){} //1C
  void f2(){} //2C
  void invoke(Plugin p){
    p.do(this);
  }
}
//==========================
class F3Imp implements Plugin{
  void do(CB){}//3B
  void do(CC){}//3C  
}
class F4Imp implements Plugin{
  void do(CB){}//4B
  void do(CC){}//4C  
}
void doJob(CA a){
  a.f1(); <--1? B|C. 
  a.f2(); <--2? B|C  
    
  F3Imp f3 = new F3Imp();
  a.invoke(f3);<--3? B|C. 
  
  F4Imp f4 = new F4Imp();
  a.invoke(f4);<--4? B|C.
}

doJob(new ?); <-- CB | CC
