package com.wangyanci.pojo;

import java.util.Date;

public class Orders {
	@Override
	public String toString() {
		return "Orders [id=" + id + ", money=" + money + ", receiverinfo=" + receiverinfo + ", paystate=" + paystate
				+ ", ordertime=" + ordertime + ", userId=" + user_id + "]";
	}

	private String id;

	private Double money;

	private String receiverinfo;

	private Integer paystate;

	private Date ordertime;

	private Integer user_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getReceiverinfo() {
		return receiverinfo;
	}

	public void setReceiverinfo(String receiverinfo) {
		this.receiverinfo = receiverinfo == null ? null : receiverinfo.trim();
	}

	public Integer getPaystate() {
		return paystate;
	}

	public void setPaystate(Integer paystate) {
		this.paystate = paystate;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}