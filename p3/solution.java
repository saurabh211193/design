Factory dbFactory = Factory.getSQLInstance();



Connection connection = dbFactory.getNewConnection();
connection.open("mydb;scott;tiger");

Transaction transaction = dbFactory.getNewTransaction();
transaction.begin(connection);

Command cmd1 = dbFactory.getNewSqlCommand();
cmd1.execute(transaction, "insert into emp values(10,'jack',2500')");



Command cmd2 = dbFactory.getNewSqlCommand();
cmd2.execute(transaction, "insert into emp values(20,'jill',4300')");

transaction.commit();

SqlTransaction transaction2 = new SqlTransaction();
transaction2.begin(connection);

SqlCommand cmd3 = new SqlCommand();
cmd3.execute(transaction, "insert into emp values(10,'jack',2500')");



transaction2.commit();
connection.close();
