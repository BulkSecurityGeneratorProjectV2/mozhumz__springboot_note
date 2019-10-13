package com.hyj.demo.entity.po.mongo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/** 
* @author mozhumz 
* @date 2018年11月22日 下午9:52:03 
* 
*/
@Data
@Document(collection="t_test")
public class TestPO {
	private String name;
	
	private String _id;
}
