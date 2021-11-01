package com.example.demo.controller;
import org.springframework.core.io.ClassPathResource;
import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

import java.io.*;

public class DT {

    public void doid() throws Exception {


        Instances data = new ConverterUtils.DataSource("C:\\Users\\dorot\\Downloads\\flowers.arff").getDataSet();
        data.setClassIndex(data.numAttributes() - 1);
        String[] options = new String[1];
        //options[0] = "-C 1.0 –M 4"; // confidenceFactor = 1.0, minNumObject = 5

        J48 tree = new J48(); // new instance of tree
        //tree.setOptions(options); // set the options
        tree.buildClassifier(data); // build classifier
        System.out.println("Decision tree model:\n"+tree);


// setting class attribute
        data.setClassIndex(data.numAttributes() - 1);

    }


}
