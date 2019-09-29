package com.qianxun.xunwu.repository;

import java.util.List;

import com.qianxun.xunwu.entity.HouseDetail;
import org.springframework.data.repository.CrudRepository;



/**
 * Created by 瓦力.
 */
public interface HouseDetailRepository extends CrudRepository<HouseDetail, Long>{
    HouseDetail findByHouseId(Long houseId);

    List<HouseDetail> findAllByHouseIdIn(List<Long> houseIds);
}
