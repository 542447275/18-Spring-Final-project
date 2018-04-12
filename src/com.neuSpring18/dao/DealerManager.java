package com.neuSpring18.dao;

import com.neuSpring18.dto.Dealer;
import com.neuSpring18.io.DealerIO;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DealerManager implements IDealerManager{
    @Override
    public Collection<Dealer> getAllDealers() {
        List<String> dealers = DealerIO.getAllDealers();
        List<Dealer> result = new LinkedList<>();
        for (String d : dealers) {
            result.add(new Dealer(d));
        }
        return result;
    }
}
