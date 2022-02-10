package com.capitole.challenge;

import java.time.LocalDateTime;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.capitole.challenge.domian.api.entity.Price;
import com.capitole.challenge.domian.api.service.PriceService;
import com.capitole.challenge.domian.spi.PricePort;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Import(ChallengeApplicationTestsConfig.class)
public class PriceServiceTest {

	@Autowired
	private PriceService service;
	
	@MockBean
	private PricePort port;
	
	@Autowired
	private Price expectedPriceFirstRow;
	
	@Autowired
	@Qualifier("expectedfecha")
	private LocalDateTime expectedfecha;
	
	@Test
	void testGetPriceProductByDateProductBrand() {
		
		Mockito.when(this.port.getPriceProductByDateProductBrandNativeQuery(ArgumentMatchers.any(), 
				ArgumentMatchers.anyInt(),ArgumentMatchers.anyInt())).thenReturn(expectedPriceFirstRow);
		
		Mockito.when(this.port.existsByBrandId(1)).thenReturn(true);
		Mockito.when(this.port.existsByProductId(35455)).thenReturn(true);
		
		final Price result = this.service.getPriceProductByDateProductBrand(expectedfecha, 
				ChallengeApplicationTestsConfig.PRODUCT_ID, ChallengeApplicationTestsConfig.BRAND_ID);
		Assertions.assertThat(result).isNotNull();
		
		final Price c = result;
		Assertions.assertThat(c.getId()).isEqualTo(1L);
	}
	
	@Test
	void testGetPriceProductByDateProductBrandNamedQuery() {
		
		Mockito.when(this.port.getPriceProductByDateProductBrandNamedQuery(ArgumentMatchers.any(), 
				ArgumentMatchers.anyInt(),ArgumentMatchers.anyInt())).thenReturn(expectedPriceFirstRow);
		
		Mockito.when(this.port.existsByBrandId(1)).thenReturn(true);
		Mockito.when(this.port.existsByProductId(35455)).thenReturn(true);
		
		final Price result = this.service.getPriceProductByDateProductBrandNamedQuery(expectedfecha, 
				ChallengeApplicationTestsConfig.PRODUCT_ID, ChallengeApplicationTestsConfig.BRAND_ID);
		Assertions.assertThat(result).isNotNull();
		
		final Price c = result;
		Assertions.assertThat(c.getId()).isEqualTo(1L);
	}

}
