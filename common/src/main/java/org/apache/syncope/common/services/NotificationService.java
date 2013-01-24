/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.common.services;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.apache.syncope.common.to.NotificationTO;

@Path("notifications")
public interface NotificationService {
    @POST
    Response create(NotificationTO notificationTO);

    @GET
    @Path("{notificationId}")
    NotificationTO read(@PathParam("notificationId") Long notificationId) throws NotFoundException;

    @GET
    List<NotificationTO> list();

    @PUT
    @Path("{notificationId}")
    NotificationTO update(@PathParam("notificationId") Long notificationId, NotificationTO notificationTO);

    @DELETE
    @Path("{notificationId}")
    NotificationTO delete(@PathParam("notificationId") Long notificationId);
}
