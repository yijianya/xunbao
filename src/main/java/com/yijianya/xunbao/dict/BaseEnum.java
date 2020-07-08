package com.yijianya.xunbao.dict;

 /**
  * 字典枚举类抽象接口
  * @param <L> 字典项的中文名称
  * @param <V> 字典项的值
  */
public interface BaseEnum<L,V> {

	/**
	 * 获取中文名称
	 * @return
	 */
	 L getName();

	/**
	 * 获取值
	 * @return
	 */
	  V getValue();
}
