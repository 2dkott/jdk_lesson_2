package sevices;

public class FullStackDeveloperImpl implements FullStackDeveloper{


    @Override
    public void createServer() {
        System.out.println("Create Server");
    }

    @Override
    public void creatGUI() {
        System.out.println("Create GUI");
    }
}
