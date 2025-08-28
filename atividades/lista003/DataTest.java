public class DataTest{
    private Data data01;
    private Data data02;
    private Data data03;
    
    public DataTest(Data d1, Data d2, Data d3){
        this.data01 = d1;
        this.data02 = d2;
        this.data03 = d3;
    }
    
    public void DiplayDatas(){
        this.data01.displayData();
        this.data02.displayData();
        this.data03.displayData();
    }
}