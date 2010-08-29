require 'rubygems'
require 'dm-core'
require 'dm-migrations'

# Open the database test1.db
DataMapper.setup( :default, 'sqlite::memory:')
