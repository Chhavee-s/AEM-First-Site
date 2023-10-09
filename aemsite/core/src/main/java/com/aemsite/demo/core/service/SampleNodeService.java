package com.aemsite.demo.core.service;

import javax.jcr.RepositoryException;
import javax.jcr.Session;

public interface SampleNodeService {
    public void createNode(final Session session, final String path, final String nodeName, final String type) throws RepositoryException;
}
