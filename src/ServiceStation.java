import java.util.List;

public class ServiceStation {
    public void check(ServicedTransport transport) {
        transport.service();
    }

    public void check(List<ServicedTransport> transportList) {
        for (ServicedTransport transport : transportList) {
            transport.service();
            System.out.println();
        }
    }
}