package service.employee;

import model.employee.EducationDegree;

import java.util.List;

public interface IEducationDegreeService {
    List<EducationDegree> selectAllEducationDegree();
    EducationDegree getEducationDegreeById(int id);
}
