public class HinhChuNhat {
    public float dai;
    public float rong;
    public HinhChuNhat(){}

    public HinhChuNhat(float d,float r){
        this.dai=d;
        this.rong=r;
    }
    public float chuvi(){
        return (dai+rong)*2;
    }
    public float dientich(){
        return dai*rong;
    }
}
