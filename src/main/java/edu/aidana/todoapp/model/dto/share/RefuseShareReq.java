package edu.aidana.todoapp.model.dto.share;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

public class RefuseShareReq {
    List<String> fileIds = new ArrayList<>();
}