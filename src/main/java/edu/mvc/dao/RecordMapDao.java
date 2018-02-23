package edu.mvc.dao;

import edu.mvc.model.Record;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RecordMapDao implements RecordDao {

    private Map<Long, Record> records = new HashMap<>();
    private long ids;

    {
        Record record1 = new Record();
        record1.setName("Record 1");
        record1.setDescription("Record 1 description");
        save(record1);

        Record record2 = new Record();
        record2.setName("Record 2");
        record2.setDescription("Record 2 description");
        save(record2);
    }

    public Record findById(Long id) {
        return records.get(id);
    }

    public List<Record> list() {
        return new ArrayList<>(records.values());
    }

    public void delete(Long id) {
        records.remove(id);
    }

    public Record save(Record record) {
        if(Objects.isNull(record.getId())) {
            record.setId(ids++);
        }
        return records.put(record.getId(), record);
    }
}
