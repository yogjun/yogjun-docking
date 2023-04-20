package cn.yogjun.springtest;

import cn.yog.docking.executor.executor.SourceExecutor;
import cn.yog.docking.executor.executor.SourceExecutorFactory;
import cn.yog.docking.executor.param.Params;
import cn.yogjun.docking.source.manager.bean.base.RootSourceBean;
import cn.yogjun.docking.source.manager.support.JsonSourceReader;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.io.FileReader;

@SpringBootTest
class SpringTestApplicationTests {

  @Test
  void contextLoads() throws FileNotFoundException {
    FileReader fileReader =
        new FileReader(
            "/Users/miaojun/code/java/yog-docking/spring-test/src/test/resources/demo-api-rest2.json");
    RootSourceBean sourceBean = new JsonSourceReader().read(fileReader);
    System.out.println(sourceBean);

    Params p = new Params();

    SourceExecutor se = SourceExecutorFactory.getExecutor(sourceBean);
    se.execute(sourceBean, p);
    System.out.println(p);
  }
}