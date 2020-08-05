package com.karaoke;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


public class GeneroMusicalControllerTest extends KaraokeApplicationTests{
	

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGETAllGeneroMusical() throws Exception{
		this.mockMvc.perform(get("/v1/generos")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	@Test
	public void contextLoads() throws Exception{
		assertThat(mockMvc).isNotNull();
	}
	
	

	
}
