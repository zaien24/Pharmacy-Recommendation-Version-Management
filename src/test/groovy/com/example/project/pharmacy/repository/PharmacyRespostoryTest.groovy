package com.example.project.pharmacy.repository

import com.example.project.AbstractIntegrationContainerBaseTest
import com.example.project.pharmacy.entity.Pharmacy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class PharmacyRespostoryTest extends AbstractIntegrationContainerBaseTest {

    @Autowired
    private PharmacyRespostory pharmacyRespostory;

    def "PharmacyRepository save"() {
        given:
        String address = " 서울 특별시 성북구 종암동"
        String name = "은혜 약국"
        double latitude = 36.11
        double longitude = 128.11

        def pharmacy = Pharmacy.builder()
                .pharmacyAddress(address)
                .pharmacyName(name)
                .latitude(latitude)
                .longitude(longitude)

        when:
        def result = pharmacyRespostory.save(pharmacy)

        then:
        result.getPharmacyAddress() == address
        result.getPharmacyName() == name
        result.getLatitude() == latitude
        result.getLongitude() == longitude
    }
}
