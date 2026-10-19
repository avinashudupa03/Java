class ATM:
    def __init__(self,__balance):
        self.__balance=__balance
    def deposite(self,amount):
        self.__balance+=amount
    def display(self):
        print("current balance:",self.__balance)
a=ATM(50000)
a.deposite(500)
a.display()

class Parent:
    def parent(self):
        print("from parent class")
class Child(Parent):
    def child(self):
        print("from child class")
c=Child()
c.child()
c.parent()