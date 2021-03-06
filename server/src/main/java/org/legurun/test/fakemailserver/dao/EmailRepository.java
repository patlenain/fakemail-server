/*
 * Copyright (C) 2017-2018 Patrice Le Gurun
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.legurun.test.fakemailserver.dao;

import org.legurun.test.fakemailserver.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Email repository.
 *
 * @author patlenain
 * @since 2017
 */
public interface EmailRepository
	extends JpaRepository<Email, Long>, EmailRepositoryCustom {

}
