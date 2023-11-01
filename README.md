# ADV2
We first import all packages, classes or interface. We started by defining the user category (the most broad categories),
which includes manager, manager, and employees. The properties in the class are id, age, name, hourly rate,

and completed hours with data type for each, as required. Of course, a constructor to assign values ​​to each variable.
In the user class we have methods such as The getter and setter for each property. Where the getter is to return the value of the variable,
and the setter is to assign real values ​​to the variables. 
Now, we will start partitioning the user First: The staff extends with the user, meaning it depends on it.

That is, the user is basic and the staff is extended. It contains user properties and is defined in the staff constructor.
Second: The manager extends with the user, meaning that it depends on it, meaning that the user is basic and the manager is extended. 
It contains user properties and is defined in the Manager Constructor. 
We defined a new list to fetch the staff and assign a value to the staff, using setter and grtter, because the manager manages the staff, so we must create a list of type staff.
Next, the director class, which is also an extended user where it has user properties, In fact, the director manage manager thus manages the staff. 
So we created a list of type manager, to get and set value for manager. We have created a fake database, as requested, 
To store and retrieve user information We created a map to store in the name of the user, where the id will be the key and the private data in the user will be the value
It cannot be modified after that because it is final, This class contains methods
First, add a new user by getting the private ID in the user.
We have created a generate report class as required. 
We created a template store class as required. 
In the main class We created one director with his data, a manager with his data entry, and two staff.

Note:sorry, If I had more time, I would think more about generate report and budget class, and template store.
