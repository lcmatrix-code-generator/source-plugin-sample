package top.lcmatrix.util.codegenerator.plugin.sample;

import top.lcmatrix.util.codegenerator.common.plugin.AbstractSourcePlugin;
import top.lcmatrix.util.codegenerator.common.plugin.Global;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SampleSourcePlugin extends AbstractSourcePlugin<InputModel, OutputModel> {

	@Override
	public List<OutputModel> getOutputModels(InputModel inputModel, Global global) {
		getLogger().debug(inputModel.getEmail());
		getLogger().debug(inputModel.getAnimals().toString());
		getLogger().debug(global.toString());
		List<OutputModel> outputModelList = new ArrayList<>();
		OutputModel m1 = new OutputModel();
		m1.setData1(new Object());
		m1.setCreateTime(new Date());
		outputModelList.add(m1);
		return outputModelList;
	}

}
