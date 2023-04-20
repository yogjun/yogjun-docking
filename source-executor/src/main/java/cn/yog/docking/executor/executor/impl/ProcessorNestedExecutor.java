package cn.yog.docking.executor.executor.impl;

import cn.yog.docking.executor.executor.AbstractExecutor;
import cn.yog.docking.executor.executor.SourceExecutor;
import cn.yog.docking.executor.executor.SourceExecutorFactory;
import cn.yog.docking.executor.param.Params;
import cn.yogjun.docking.bean.constants.SourceTypeAlias;
import cn.yogjun.docking.source.manager.bean.base.SourceBean;
import cn.yogjun.docking.source.manager.bean.processor.ProcessorNestedSource;
import cn.yogjun.docking.source.manager.bean.processor.ProcessorReferenceSource;
import org.springframework.stereotype.Component;

/**
 * {@link ProcessorNestedExecutor}
 *
 * @author <a href="mailto:matthew.miao@yunlsp.com">matthew.miao</a>
 * @version ${project.version} - 2023/4/14
 */
@Component(value = SourceTypeAlias.PROCESSOR_NESTED)
public class ProcessorNestedExecutor extends AbstractExecutor<ProcessorNestedSource> {
  @Override
  protected void sourceExecute(SourceBean<ProcessorNestedSource> source, Params params) {
    ProcessorNestedSource processorNestedSource = source.getSpec();
    SourceExecutor se = SourceExecutorFactory.getExecutor(processorNestedSource.getSource());
    se.execute(processorNestedSource.getSource(), params);
  }
}