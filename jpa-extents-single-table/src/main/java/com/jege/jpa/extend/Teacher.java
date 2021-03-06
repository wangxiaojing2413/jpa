package com.jege.jpa.extend;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author JE哥
 * @email 1272434821@qq.com
 * @description:子类
 */
@Entity
@DiscriminatorValue("2")
public class Teacher extends Person {
  private String address;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
