class mycar{
    int max_speed;
    int min_speed;
    String car_type;
    int car_cost;
    String color;
    public mycar(String color, int car_cost, String car_type, int min_speed, int max_speed ){
        this.color = color;
        this.car_cost = car_cost;
        this.car_type = car_type;
        this.min_speed = min_speed;
        this.max_speed = max_speed;
    }

    public String getcolor(){
        return color;
    }
    public int getspeed(){
        return max_speed;

    }
    public int getmin(){
        return min_speed; 
    }
    public String getcar_type(){
        return car_type;
    }
    public int getcost(){
        return car_cost;
    }
    public String print(){
        return ("Hi! my car costs"+" "+ this.getcost() + " " + "dollars" + "." +  "\n" + "its color is" +" "+ this.getcolor() +"." +"\n"
        + "it is a"+" "+ this.getcar_type() + " and it can speed up to" +" "+ this.getspeed() +" "+ "mph" + "." + "\n");
    }

    public static void main(String[] args){
    mycar BMW = new mycar("twilight", 30000, "BMW", 0, 120 );
    System.out.println(BMW.print());
    }

}