import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void testFindById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext_service.xml");
        ItemsService itemsService = (ItemsService) ac.getBean(ItemsService.class);
        System.out.println(itemsService);
        Items items = itemsService.findById(1);
        System.out.println(items);

    }
}
