package Irctc.IrctcMimic.Models;

import Irctc.IrctcMimic.Enums.BranchName;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(EnumType.STRING)
    private BranchName branchName;
    private  String hodName;
    private String contactNo;

    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    List<Student> studentList=new ArrayList<>();
}
