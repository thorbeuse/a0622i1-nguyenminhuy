package service.employee;

import model.employee.Position;

import java.util.List;

public interface IPositionService {
    List<Position> selectAllPosition();
    Position getPositionById(int id);
}
