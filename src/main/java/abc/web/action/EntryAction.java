package abc.web.action;

import java.util.List;

import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import abc.biz.CategoryBiz;
import abc.biz.EntryBiz;
import abc.entity.Category;
import abc.entity.Entry;


@Component
@Scope("prototype")
public class EntryAction extends ActionSupport{
	@Autowired
	private EntryBiz entryBiz;
	
	@Autowired
	private  CategoryBiz  categoryBiz;
	
	
	private List<Entry> entrys;
	private List<Category> categorys;
	private int categoryId;
    private int id;
    private Entry entry;
	
	
	public List<Entry> getEntrys() {
		return entrys;
	}



	public void setEntrys(List<Entry> entrys) {
		this.entrys = entrys;
	}



	public List<Category> getCategorys() {
		return categorys;
	}



	public void setCategorys(List<Category> categorys) {
		this.categorys = categorys;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		
		this.categoryId = categoryId;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Entry getEntry() {
		return entry;
	}



	public void setEntry(Entry entry) {
		this.entry = entry;
	}

	public String index() {
		categorys = categoryBiz.findAll();
		entrys = entryBiz.findeAll(categoryId);
		return SUCCESS;
	}

	public String delete() {
		entryBiz.deleteEntry(id);
		return SUCCESS;
	}
	
	public String fetchById() {
		entry = entryBiz.fetchById(id);
		return SUCCESS;
	}
	
	public String update() {
		entry.setCategory(entryBiz.fetchById(entry.getId()).getCategory());
		entryBiz.updateEntry(entry);
		return SUCCESS;
	}
	
	public String addSave() {
//		Entry e = new Entry();
//		e.setId(categoryId);
//		entry.setCategory(e);
		return SUCCESS;
				
	}
	
	
}
