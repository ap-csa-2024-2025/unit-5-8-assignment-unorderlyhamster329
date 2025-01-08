public class Dog
{
  private String name;
  private int ID;
  private static int numDogs = 0;

  // Non-default Dog constructor
public Dog(String name){
  this.name = name;
  numDogs++;
  this.ID = numDogs * numDogs;

}
  // Default Dog constructor

  // Setters - instance variables only
public void setName(String iName) {
  name = iName;
}

public void setID(int iID){
  ID = iID;
}

public void setNumDogs(int iNumDogs) {
  numDogs = iNumDogs;
}
  // Getters - instance variables only
public String getName() {
  return name;
}

public int getID() {
  return ID;
}

public int getNumDogs() {
  return numDogs;
}
  // method getNumDogs
}
