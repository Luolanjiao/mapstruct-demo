import com.llj.data.Man;
import com.llj.data.mapper.InsertRequst;
import com.llj.data.mapper.ManDTOMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * @author Jogen
 * @date 2019/4/6
 */
//@SpringBootTest
public class TestApplication {

    InsertRequst insertRequst;

    @Before
    public void injectModel(){
        insertRequst=new InsertRequst("llj",18,"18888888888","dsdfs","2");
    }

    @Test
    public void test(){

       Man man= ManDTOMapper.INSTANCE.toMan(insertRequst);
      assertThat(man).isNotNull();
      assertThat(man.getName()).isEqualTo(insertRequst.getName());
    }
}
