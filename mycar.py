class mycar():
     def __init__(self, color,cost, type, min, max):
          self.color = color
          self.cost = cost
          self.type = type
          self.min = min
          self.max = max
     def getcolor(self):
          return self.color
     def getspeed(self):
          return self.max
     def getmin(self):
          return self.min
     def gettype(self):
          return self.type
     def getcost(self):
          return self.cost
     def print(self):
          return ("Hi! my car costs"+" "+ str(self.getcost()) + " " + "dollars" + "." +  "\n" + "its color is" +" "+ self.getcolor() +"." +"\n"
        + "it is a"+" "+ self.gettype() + " and it can speed up to" +" "+ str(self.getspeed()) +" "+ "mph" + "." + "\n")
BMW = mycar("twlight", 30000, "BMW", 0, 120)
print(BMW.print())
