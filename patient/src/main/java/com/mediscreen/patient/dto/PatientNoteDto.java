package com.mediscreen.patient.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

/**
 * (DTO) for Patient Notes.
 * This class represents the data to create or update a patient note.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientNoteDto {
    /**
     * The ID of the note.
     */
    private String id;

    /**
     * The ID of the patient associated with this note.
     */
    private Long patientId;

    /**
     * The content of the patient note.
     */
    @NotBlank
    private String note;

    /**
     * The creation date of the note.
     */
    private LocalDate creationDate;

    public PatientNoteDto(long patientId, String note) {
        this.patientId = patientId;
        this.note = note;
    }
}
