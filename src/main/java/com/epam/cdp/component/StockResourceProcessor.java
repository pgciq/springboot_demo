package com.epam.cdp.component;

import com.epam.cdp.entity.Stock;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

@Component
public class StockResourceProcessor implements ResourceProcessor<Resource<Stock>> {
    @Override
    public Resource<Stock> process(Resource<Stock> resource) {
        resource.add(new Link("http://cdn.imaibo.net/images/" + resource.getContent().getId() + ".jpg", "profile-photo"  ));
        return resource;
    }
}