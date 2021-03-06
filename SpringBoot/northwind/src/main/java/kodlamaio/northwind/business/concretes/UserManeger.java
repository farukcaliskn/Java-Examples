package kodlamaio.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.UserService;
import kodlamaio.northwind.core.dataAccess.UserDao;
import kodlamaio.northwind.core.entities.User;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccesDataResult;

@Service
public class UserManeger implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManeger(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<User>(this.userDao.save(user), "Data listelendi");
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		// TODO Auto-generated method stub
		return new SuccesDataResult<User>(this.userDao.getByEmail(email), "Data listelendi");
	}

}
