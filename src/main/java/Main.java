import Presenter.SetData;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        SetData setData = new SetData();
        setData.setRequest();
        GetData getData = new GetData();
        getData.getResponse();
        System.out.println("finish");
    }


}
