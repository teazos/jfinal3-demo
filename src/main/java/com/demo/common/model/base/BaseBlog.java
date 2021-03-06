package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBlog<M extends BaseBlog<M>> extends Model<M> implements IBean {

	public M setId(Integer id) {
		set("id", id);
		return (M)this;
	}

	public Integer getId() {
		return get("id");
	}

	public M setTitle(String title) {
		set("title", title);
		return (M)this;
	}

	public String getTitle() {
		return get("title");
	}

	public M setContent(String content) {
		set("content", content);
		return (M)this;
	}

	public String getContent() {
		return get("content");
	}

}
