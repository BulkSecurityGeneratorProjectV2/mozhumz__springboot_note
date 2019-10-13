package com.hyj.demo.entity.po.mongo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/** 
* @author mozhumz 
* @date 2018年11月22日 下午9:46:12 
* 
*/
@Document(collection="t_customer")
@Data
public class Customer {

public String _id;
    public String carNumber;

}