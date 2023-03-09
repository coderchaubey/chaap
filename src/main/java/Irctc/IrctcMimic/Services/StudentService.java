package Irctc.IrctcMimic.Services;

import Irctc.IrctcMimic.Models.Student;
import Irctc.IrctcMimic.Repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public String addStudent(Student student){
        Student student1=Student.builder().branchName(student.getBranchName())
                .name(student.getName()).marks(student.getMarks())
                .rollNo(student.getRollNo()).build();

        studentRepo.save(student1);
        return "Laund Added successfully"+student.getBranchName();
    }
}
