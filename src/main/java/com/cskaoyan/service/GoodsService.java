package com.cskaoyan.service;

import com.cskaoyan.bean.GoodsPart.Attribute;
import com.cskaoyan.bean.GoodsPart.VO.GoodsVO;
import com.cskaoyan.bean.GoodsPart.Goods;
import com.cskaoyan.bean.GoodsPart.Product;
import com.cskaoyan.bean.GoodsPart.Specification;
import com.cskaoyan.bean.GoodsPart.VO.CatAndBrandVO;
import com.cskaoyan.bean.ListBean;

import java.util.List;

public interface GoodsService {
    
    ListBean queryGoodsListBean(Integer page, Integer limit, String sort, String order);

    CatAndBrandVO catAndBrand();

    void create(Goods goods, List<Specification> specifications, List<Product> products, List<Attribute> attributes);

    GoodsVO detail(Integer id);

    void update(Goods goods, List<Specification> specifications, List<Product> products, List<Attribute> attributes);
}
