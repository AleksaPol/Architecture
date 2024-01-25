import InMemoryModel.IModelChangeObserver;
import InMemoryModel.ModelStore;
import ModelElements.Point3D;

public class Main {

    public static void main(String[] args, IModelChangeObserver changeObserver, Point3D points) {

        ModelStore modelStore = new ModelStore(changeObserver, points);
    }
}