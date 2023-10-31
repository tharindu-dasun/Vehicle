package lk.ijse.gdse.Vehicle.service.impl;

import lk.ijse.gdse.Vehicle.dto.VehicleDTO;
import lk.ijse.gdse.Vehicle.entity.Vehicle;
import lk.ijse.gdse.Vehicle.repo.VehicleRepo;
import lk.ijse.gdse.Vehicle.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleRepo vehicleRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveVehicle(VehicleDTO dto) {
        vehicleRepo.save(mapper.map(dto, Vehicle.class));
    }

    @Override
    public void uploadVehicleImage(String frontPath, String BackPath, String sidePath, String InteriorPath, Long id) {
        System.out.println("Car Impl-if");
        vehicleRepo.updateVehicleFilePaths(frontPath, BackPath, sidePath,InteriorPath, id);
    }

    @Override
    public void updateVehicle(VehicleDTO dto) {
        vehicleRepo.save(mapper.map(dto, Vehicle.class));
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepo.deleteById(id);
    }

    @Override
    public VehicleDTO searchVehicleById(String id) {
        return null;
    }

    @Override
    public List<VehicleDTO> getAllVehicleDetail() {
        return mapper.map(vehicleRepo.findAll(), new TypeToken<List<VehicleDTO>>() {}.getType());
    }

    @Override
    public void uploadCarImage(String frontPath, String BackPath, String sidePath, String InteriorPath, Long vehicleId) {
        vehicleRepo.updateVehicleFilePaths(frontPath, BackPath, sidePath,InteriorPath, vehicleId);
    }
}
