package com.sharebo.service;

import org.apache.ibatis.annotations.Param;
import com.sharebo.entity.dto.DetailsDto;

public interface DetailsService {
	/**
	 * ��λ����
	 * @param userid
	 * @return
	 */
	public DetailsDto getloadAllDetails(@Param("carportId")String carportId);
	/**
	 * ��ѯ�Ƿ��ղ�
	 * @param userid
	 * @param identifying
	 * @return
	 */
	public Integer getloadAllDetailCount(@Param("userid")String userid,@Param("identifying")String identifying);
}