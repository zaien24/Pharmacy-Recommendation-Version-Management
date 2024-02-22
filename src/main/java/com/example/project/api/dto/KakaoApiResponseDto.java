package com.example.project.api.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class KakaoApiResponseDto {

    private MetaDto metaDto;

    private List<DocumentDto> dOcumentDtoList;




}
