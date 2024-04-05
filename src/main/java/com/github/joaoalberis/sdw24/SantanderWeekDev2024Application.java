package com.github.joaoalberis.sdw24;

import com.github.joaoalberis.sdw24.application.AskChampionUseCase;
import com.github.joaoalberis.sdw24.application.ListChampionsUseCase;
import com.github.joaoalberis.sdw24.domain.ports.ChampionsRepository;
import com.github.joaoalberis.sdw24.domain.ports.GenerativeAiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class SantanderWeekDev2024Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderWeekDev2024Application.class, args);
	}

	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository championsRepository){
		return new ListChampionsUseCase(championsRepository);
	}

	@Bean
	public AskChampionUseCase provideAskChampionUseCase(ChampionsRepository championsRepository, GenerativeAiService generativeAiApi){
		return new AskChampionUseCase(championsRepository, generativeAiApi);
	}
}
