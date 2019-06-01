package com.zxl.repository;

import com.zxl.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zxl
 * @date 2019/6/1
 */
public interface GoodsRepository extends JpaRepository<Goods, Long> {

    List<Goods> findAllByGoodsIdBetween(Long goodsId1, Long goodsId2);

    List<Goods> findAllByGoodsIdIn(List<Long> goodsIds);
}
