package movie.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import movie.dao.mapper.MovieMapper;
import movie.vo.MovieVO;

@Repository
public class MovieDaoImpl implements MovieDao {
	
	@Autowired
	private MovieMapper mapper;

	public MovieDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public MovieVO getMovie(String title) {
		// TODO Auto-generated method stub
		return mapper.selectMovieByMovietitle(title);
	}

	@Override
	public List<MovieVO> getMovies() {
		// TODO Auto-generated method stub
		return mapper.selectMovieList();
	}

	@Override
	public int insertMovie(MovieVO movie) {
		// TODO Auto-generated method stub
		return mapper.insertMovie(movie);
	}

	@Override
	public int updateMovie(MovieVO movie) {
		// TODO Auto-generated method stub
		return mapper.updateMovie(movie);
	}

	@Override
	public int deleteMovie(int id) {
		// TODO Auto-generated method stub
		return mapper.deleteMovie(id);
	}
	
}
