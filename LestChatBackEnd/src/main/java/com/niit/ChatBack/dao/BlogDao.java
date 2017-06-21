package com.niit.ChatBack.dao;

import java.util.List;

import com.niit.ChatBack.model.Blog;

public interface BlogDao
{
	public boolean save(Blog blog);
	
	public boolean update(Blog blog);
	
	public boolean delete(String id);
	
	public List<Blog> list();
	
	public Blog get(String id);

}
