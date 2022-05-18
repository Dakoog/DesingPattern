package designPattern.builder;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String academy;
    private String fieldOfStudy;
    private String indeks;
    private Long idIndeks;
    private Double averageGrade;

}
