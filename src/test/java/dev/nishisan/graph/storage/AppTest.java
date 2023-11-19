/*
 * Copyright (C) 2023 Lucas Nishimura <lucas.nishimura at gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dev.nishisan.graph.storage;

import org.junit.Test;
import org.rocksdb.Options;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;
import org.rocksdb.WALRecoveryMode;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void loadRocksDbLibrary() {
        RocksDB.loadLibrary();
        Options options = new Options()                
                .setCreateIfMissing(true)
                .setDbLogDir("/tmp/db/logs")
                
                .setWalRecoveryMode(WALRecoveryMode.AbsoluteConsistency);
        try {

            try (final RocksDB db = RocksDB.open(options, "/tmp/db")) {
                //
                //
                //
                db.pu
            }
        } catch (RocksDBException e) {
            // do some error handling

        }
    }
}
