package edu.mvc.dao;

import edu.mvc.model.Record;

import java.util.List;

public interface RecordDao {

    Record findById(Long id);

    List<Record> list();

    void delete(Long id);

    Record save(Record record);

}
