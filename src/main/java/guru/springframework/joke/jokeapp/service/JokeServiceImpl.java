package guru.springframework.joke.jokeapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

	public final ChuckNorrisQuotes chunkNorrisQuotes;

	public JokeServiceImpl() {
		this.chunkNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getRandomJoke() {

		return chunkNorrisQuotes.getRandomQuote();
	}

}
