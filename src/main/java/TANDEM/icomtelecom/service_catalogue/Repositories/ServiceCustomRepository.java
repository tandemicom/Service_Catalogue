package TANDEM.icomtelecom.service_catalogue.Repositories;

import TANDEM.icomtelecom.service_catalogue.Model.CategoryRef;
import TANDEM.icomtelecom.service_catalogue.Model.Service;
import TANDEM.icomtelecom.service_catalogue.Model.ServiceState;
import TANDEM.icomtelecom.service_catalogue.Model.TransportInfo;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceCustomRepository {
    public List<Service> findServicesByProperties(String serName, String version, ServiceState state, Pageable page);
}
