package abc.dao;

import java.util.List;

import abc.entity.Entry;
public interface EntryDao {
	List<Entry> findeAll(int categoryId);
	Entry fetchById(int id);
	void addEntry(Entry entry);
	void updateEntry(Entry entry);
	void deleteEntry(int id);
}
